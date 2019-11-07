
package sample.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.midfield_system.api.system.MfsSystem;

//------------------------------------------------------------------------------
/**
 * ?* Sample code of MidField System API: SimpleVideoChat ?* ?* Date Modified:
 * 2019.08.23 ?* ?
 */

// ==============================================================================
public class SimpleVideoChat
{
    // ==============================================================================
    // ?CLASS METHOD:
    // ==============================================================================

    // ------------------------------------------------------------------------------
    // ?PUBLIC STATIC METHOD:
    // ------------------------------------------------------------------------------

    // - [MAIN METHOD] ----------------------------------------------------------
    //
    public static void main(String[] args)
	{
	 BufferedReader in = new BufferedReader(new InputStreamReader(System. in));

     MfsSystem mfs = null;
     SimpleViewer viewer = null;

     try {
         // SimpleViewer �𐶐����A�\������B
         int width = 640;
         int height = 240;
         int rows = 1;
         int cols = 2;
         viewer = new SimpleViewer("Video Chat", width, height, rows, cols);

         // MidField System ���Z�b�g�A�b�v����B
         mfs = MfsSystem.setup();
         // MfsException
         
         // midfield_system �̏������J�n����B
         mfs.start();
         // MfsException

         //�r�f�I���M�p�̃T���v���\�[�X�R�[�h�����s����
         AvDevicesToStream sender = new AvDevicesToStream();
         sender.startup(mfs, viewer);

         StreamToViewer receiver = new StreamToViewer();
         receiver.startup(mfs, viewer);

         //Enter�L�[�̓��͂�҂�
         System.out.println("(Push enter key)");
         in.readLine();
         // IOException

         // �T���v���R�[�h���~����B
         sender.cleanup(viewer);
         receiver.cleanup(viewer);
     }
     catch (Exception ex){
         ex.printStackTrace();
     }
     finally{
         // MidFieldSystem���I������B
         if (mfs != null) {
             mfs.shutdown();
         }
         // SimpleViewer�̏I���������s���B
         if (viewer != null) {
             viewer.dispose();
         }
     }
    }
}