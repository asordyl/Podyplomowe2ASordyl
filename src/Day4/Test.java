package Day4;

public class Test {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider simpleDataProvider = new SimpleDataProvider();
        DataProvider fileDataProvider = new FileDataProvider();

        DataProvider[] dataProviders = new DataProvider[10];
        dataProviders[0] = new FileDataProvider();
        dataProviders[1] = new MyDataProvider();
        dataProviders[2] = new FileDataProvider();
        dataProviders[3] = new SimpleDataProvider();
        dataProviders[4] = new FileDataProvider();
        dataProviders[5] = new FileDataProvider();
        dataProviders[6] = new SimpleDataProvider();
        dataProviders[7] = new FileDataProvider();
        dataProviders[8] = new SimpleDataProvider();
        dataProviders[9] = new FileDataProvider();

        for (DataProvider dp : dataProviders){
            dataPresenter.showData(dp);
        }

        /*dataPresenter.showData(simpleDataProvider);
        dataPresenter.showData(fileDataProvider);*/
    }
}
