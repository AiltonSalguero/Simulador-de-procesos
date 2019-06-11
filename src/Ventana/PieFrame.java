package Ventana;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class PieFrame extends JPanel {

    public static void main(String... args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PieFrame().setVisible(true);
            }
        });
    }

    public PieFrame() {
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(20, "Eje Y", "Eje X");
        barChartData.setValue(1, "Eje Y", "Eje Xs");
        barChartData.setValue(15, "Eje Y", "Eje Xs");

        System.out.println("barras");
        JFreeChart barChart = ChartFactory.createBarChart("titulo", "fds", "sdfdf", barChartData, PlotOrientation.HORIZONTAL, true, true, true);
        CategoryPlot barChartPlot = barChart.getCategoryPlot();
        barChartPlot.setRangeGridlinePaint(java.awt.Color.RED);
        
        BarRenderer br = (BarRenderer) barChartPlot.getRenderer();
        br.setMaximumBarWidth(.05);
        

        ChartPanel bar_FCFS = new ChartPanel(barChart){
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(300, 200);
            }
        };
        bar_FCFS.setDomainZoomable(false);
        bar_FCFS.setRangeZoomable(false);
        this.add(bar_FCFS);
        setSize(900, 300);
    }
}
