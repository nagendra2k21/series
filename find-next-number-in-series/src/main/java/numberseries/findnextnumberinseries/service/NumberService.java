package numberseries.findnextnumberinseries.service;

import numberseries.findnextnumberinseries.entity.nextnumDetails;

import java.util.List;

public interface NumberService {
	
	public nextnumDetails nextNumInSeries(int a, int b, int c, int d, int e, int f,int g) throws InterruptedException;

}
