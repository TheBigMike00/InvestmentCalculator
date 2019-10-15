import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	int totalContributions = 0;
	double value = 1300;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	void simulate(int m)
	{
		int month = 1;
		int index = 0;
		while (month<=m)
		{
			if(theContributions.size() == index)
			{
			}
			else if(theContributions.get(index).monthNumber == month)
			{
				totalContributions += theContributions.get(index).amount;
				value-=theContributions.get(index).amount;
				index++; 
			}
			value *= 1.0067;
			month++;
		}
	}
	
	double getCurrentValue(int afterHowManyMonth)
	{
		simulate(afterHowManyMonth);
		return value;
	}
	
	double getTotalContributions()
	{
		return totalContributions;
	}
	
}
