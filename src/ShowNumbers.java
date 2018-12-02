public class ShowNumbers {
    public static void main (String[] args){

        Dimensions dim = new Dimensions();
        changeDimensions(dim, 10, 20, 30);
        showDimensions(dim);
        changeDimensions(dim, 100, 200, 300);
        showDimensions(dim);
    }

    static void changeDimensions(Dimensions dimensions, int h, int w, int d){
        dimensions.height = h;
        dimensions.weight = w;
        dimensions.depth = d;
    }

    static void showDimensions(Dimensions dimensions){
        System.out.println("Height: " + dimensions.height);
        System.out.println("Weight: " + dimensions.weight);
        System.out.println("Depth: " + dimensions.depth + "\n");
    }
}

class Dimensions {
    int height;
    int weight;
    int depth;
}
