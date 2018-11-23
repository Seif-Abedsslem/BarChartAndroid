package application.android.com.bartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    BarChart chart ;
    ArrayList<BarEntry> BARENTRY ;
    ArrayList<String> BarEntryLabels ;
    BarDataSet Bardataset ;
    BarData BARDATA ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chart = (BarChart) findViewById(R.id.chart1);

        BARENTRY = new ArrayList<>();

        BarEntryLabels =  new ArrayList<String>();

        BARENTRY.add(new BarEntry(2f, 0));
        BARENTRY.add(new BarEntry(15f, 1));
        BARENTRY.add(new BarEntry(6f, 2));
        BARENTRY.add(new BarEntry(8f, 3));
        BARENTRY.add(new BarEntry(8f, 4));

        BarEntryLabels.add("Rent");
        BarEntryLabels.add("Gorcery");
        BarEntryLabels.add("Shopping");
        BarEntryLabels.add("Travel");
        BarEntryLabels.add("Others");

        Bardataset = new BarDataSet(BARENTRY, "Projects");


        BARDATA = new BarData(BarEntryLabels, Bardataset);

        Bardataset.setColors(ColorTemplate.JOYFUL_COLORS);

        chart.setData(BARDATA);

        chart.animateY(3000);

    }

}
