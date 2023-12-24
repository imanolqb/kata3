package software.ulpgc.kata3.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JFreeChartHistogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException {
        setTitle("Histogram");
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createHistogramDisplay());
    }

    private JFreeChartHistogramDisplay createHistogramDisplay() {
        JFreeChartHistogramDisplay jFreeChartHistogramDisplay = new JFreeChartHistogramDisplay();
        histogramDisplay = jFreeChartHistogramDisplay;
        return jFreeChartHistogramDisplay;
    }

    public JFreeChartHistogramDisplay getHistogramDisplay() {
        return histogramDisplay;
    }
}
