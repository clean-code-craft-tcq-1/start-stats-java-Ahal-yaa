package statisticker;

import java.util.List;



public class Statistics 
{
	
    public static Stats getStatistics(List<Float> numbers) {
    	float average;
    	int count = 0;
    	float sum = 0;
    	Float min = Float.NaN;
    	Float max = Float.NaN;
    	Stats s = new Stats();
    	for(Float num: numbers)
    	{
    		if(count == 0)
    		{
    			min = num;
    			max = num;
    		}
    		if(num>max)
    		{
    			max = num; 
    		}
    		if(num<min)
    		{
    			min = num;
    		}
    		sum = sum + num;
    		
			count++;
    	}
    
    	average = sum/count;	
    	s.average=average;
    	s.min=min;
    	s.max=max;
       	return s;
    	
    	
    }
    public static class Stats
    {
    	public float average;
		public float min;
		public float max;
	
    }
}
