package Repositories;

import Models.Sale;
import Tools.CsvFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {

    private ArrayList<Sale> salesArrayList;

    public SalesRepository() throws FileNotFoundException {
        this.salesArrayList = CsvFileReader.readSalesCsvFile("files/minimercado.csv");
    }

    public ArrayList<Sale> getSalesArrayList() {
        return salesArrayList;
    }
}
