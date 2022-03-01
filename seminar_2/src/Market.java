
public class Market {
	public float computePriceWithoutVAT(int productType, float priceWithVAT, int period)
	  {
	    float finalPrice = 0;
	    float discountByTimeSpent = (period > 10) ? (float)30/100 : (float)period/100; 
	    if (productType == 1)
	    {
	    	finalPrice = priceWithVAT;
	    }
	    else if (productType == 2)
	    {
	    	finalPrice = (priceWithVAT - (0.1f * priceWithVAT)) - discountByTimeSpent * (priceWithVAT - (0.1f * priceWithVAT));
	    }
	    else if (productType == 3)
	    {
	    	finalPrice = (priceWithVAT - (0.25f * priceWithVAT)) - discountByTimeSpent * (priceWithVAT - (0.25f * priceWithVAT));
	    }
	    else if (productType == 4)
	    {
	    	finalPrice = (priceWithVAT - (0.35f * priceWithVAT)) - discountByTimeSpent * (priceWithVAT - (0.35f * priceWithVAT));
	    }
	    return finalPrice;
	  }
}
