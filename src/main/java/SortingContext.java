public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy){
        this.sortingStrategy=sortingStrategy;
    }

    public void setStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy=sortingStrategy;
    }

    public void performSort(String[] arr){
        if(sortingStrategy!=null){
            sortingStrategy.sort(arr);
        }
    }
}
