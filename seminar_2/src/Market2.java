
public class Market2 {
	public float computePriceWithoutVAT(Constante.PRODUCT_TYPES productType, float priceWithVAT, int timeSpent)
	  {	
		
	    float finalPrice = 0;
	    float discountByTimeSpent = (timeSpent > Constante.PRODUCT_TIME_LIMIT) ? (float)30/100 : (float)timeSpent/100; 
	    if (productType == Constante.PRODUCT_TYPES.HIGH_VALABILITY)
	    {
	    	finalPrice = priceWithVAT;
	    }
	    else if (productType == Constante.PRODUCT_TYPES.HIGH_VALABILITY)
	    {
	    	finalPrice = (priceWithVAT - (0.1f * priceWithVAT)) - discountByTimeSpent * (priceWithVAT - (0.1f * priceWithVAT));
	    }
	    else if (productType == Constante.PRODUCT_TYPES.MEDIUM_VALABILITY)
	    {
	    	finalPrice = (priceWithVAT - (0.25f * priceWithVAT)) - discountByTimeSpent * (priceWithVAT - (0.25f * priceWithVAT));
	    }
	    else if (productType == Constante.PRODUCT_TYPES.LOW_VALABILITY)
	    {
	    	finalPrice = (priceWithVAT - (0.35f * priceWithVAT)) - discountByTimeSpent * (priceWithVAT - (0.35f * priceWithVAT));
	    }
	    return finalPrice;
	  }
}
