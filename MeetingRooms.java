package com.rajesh.practice.easy.newpack;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms
{
    public boolean canAttendMeetings(Interval[] intervals)
    {
        Arrays.sort(intervals, new Comparator<Interval>()
        {
            @Override
            public int compare(Interval obj1, Interval obj2)
            {
                return obj1.start - obj2.start;
            }
        });

        for (int i = 1; i < intervals.length; i++)
        {
            if (intervals[i].start < intervals[i - 1].end)
            {
                return false;
            }
        }
        return true;
    }
}

class Interval
{
    int start;
    int end;

    Interval()
    {
        start = 0;
        end = 0;
    }

    Interval(int s, int e)
    {
        start = s;
        end = e;
    }
}
