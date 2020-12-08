import javax.swing.JFrame;
public class CaraFelizPrueba
{
    public static void main( String[] args )
    {
        CaraFeliz panel = new CaraFeliz();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel );
        application.setSize( 230, 250 );
        application.setVisible( true );
    } // end main
} // end class DrawSmileyTest