import javax.swing.*;

 public class App {
      public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run(){
            // instantiate a rockpaperScissorGUI obj
        rockpaperscissorGUI rockpaperscissorGUI = new rockpaperscissorGUI();

            // display the gui
            rockpaperscissorGUI.setVisible(true);

        }

    });

        }
    

      }

    
