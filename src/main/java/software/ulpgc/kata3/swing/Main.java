package software.ulpgc.kata3.swing;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(5, 1,2,3,4,9,0,8,6,4.3,2,5,7,8,9,4,5,2,1,6,8,9);
        MainFrame frame = new MainFrame();
        frame.getHistogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
