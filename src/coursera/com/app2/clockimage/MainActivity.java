package coursera.com.app2.clockimage;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setTitle("ClockImage");
		
		Calendar c = Calendar.getInstance(); 
		int hour = c.get(Calendar.HOUR_OF_DAY);
		
		View relLay = (View) findViewById(R.id.layClock);
		TextView msg = (TextView) findViewById(R.id.msg);
		
		int pic;
		
		if (hour > 12) {
			if (hour > 18)
			{
				msg.setText(R.string.good_night );
				pic = R.drawable.goodnight;
			}
			else{
				msg.setText(R.string.good_afternoon );
				pic = R.drawable.goodafternoon;
			}
		}
		else
		{
			msg.setText(R.string.good_morning );
			pic = R.drawable.goodmorning;
		}

		relLay.setBackgroundResource( pic);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
