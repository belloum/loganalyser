package beans.activities.dailyactivities.meals;

import beans.activities.dailyactivities.DailyActivity;
import beans.activities.dailyactivities.DailyActivity.DailyActivities;

/**
 * A Dinner representation extending {@link DailyActivity} with a name as {@link DailyActivities} and a score 
 * 
 * @param timestamp
 *            The timestamp of the activity (non-)detection as String
 * @param score
 *            The computed score of the daily dinner (between 0 and 1)
 * @see DailyActivity
 * @author Antoine Riché
 * @since 06/14/17
 */
public class Dinner extends DailyActivity {

	/**
	 * Dinner constructor
	 * 
	 * @param timestamp
	 *            The timestamp of the activity (non-)detection as String
	 * @param score
	 *            The computed score of the daily dinner (between 0 and 1)
	 */
	public Dinner(String timestamp, float score) {
		super(timestamp, score);
		this.setName(DailyActivities.Dinner);
	}

}
