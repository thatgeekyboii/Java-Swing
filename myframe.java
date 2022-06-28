import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class myframe extends JFrame{

    myframe(){
        this.setSize(420,420); //sets the size of the frame
        this.setTitle("Jframe ti tle goes here"); //sdets title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits on clicking the cross
        this.setVisible(true); //set the frame visible
        this.setResizable(false); //prevent frame from resized
        ImageIcon image = new ImageIcon("quizzzz.jpg");
        this.setIconImage(image.getImage()); // change icon of frame

        // change backgroundc olor of the frame
        //this.getContentPane().setBackground(Color.green);
        //this.getContentPane().setBackground(new Color(123,50,250));
}
}