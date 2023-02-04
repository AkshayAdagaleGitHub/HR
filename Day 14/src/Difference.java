
class Difference {
  	private int[] elements;
  	public int maximumDifference;	
  	// Add your code here
    Difference(int elements[]){
        this.elements = elements;
    }

    public void computeDifference(){
        int maxDiff=0; 
        for(int i=0;i<elements.length;i++){
            for(int j=1;j<elements.length;j++){
                maxDiff = Math.abs(elements[i]- elements[j]);
                if(maxDiff>maximumDifference){
                    maximumDifference=maxDiff;
                  }
            }
        }
    }
}