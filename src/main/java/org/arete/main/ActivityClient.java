package org.arete.main;

import org.arete.model.Activity;

/**
 * Created by rgundapaneni on 8/6/15.
 */
public class ActivityClient {

    public static void main(String[] args) {

        Activity activity = new Activity();
        activity.setActivityName("Playing volleyball");

        System.out.println(activity.getActivityName());
    }
}
