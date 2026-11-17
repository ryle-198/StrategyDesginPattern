public class Client {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());

        String[] array1 = {"cpp","c","java","python3","csharp","html","css","javascript","php","cpp14","cobol","dart","go","julia","kotlin","lisp","matlab","node","objc","perl","r","rust","ruby","scala","swift","solidity","xml"};

        sortingContext.performSort(array1);

        sortingContext.setStrategy(new MergeSortStrategy());
        String[] array2 = {"cpp","c","java","python3","csharp","html","css","javascript","php","cpp14","cobol","dart","go","julia","kotlin","lisp","matlab","node","objc","perl","r","rust","ruby","scala","swift","solidity","xml"};
        sortingContext.performSort(array2);

        sortingContext.setStrategy(new QuickSortStrategy());
        String[] array3 = {"cpp","c","java","python3","csharp","html","css","javascript","php","cpp14","cobol","dart","go","julia","kotlin","lisp","matlab","node","objc","perl","r","rust","ruby","scala","swift","solidity","xml"};
        sortingContext.performSort(array3);
    }
}
