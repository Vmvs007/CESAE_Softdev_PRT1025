package Controllers;

import Models.Sale;
import Repositories.SalesRepository;

import java.io.FileNotFoundException;

public class AdminController {

    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public double totalSalesValue() {
        double total = 0;

        for (Sale saleAtual : this.salesRepository.getSalesArrayList()) {
            total += saleAtual.getQuantity() * saleAtual.getPrice();
        }

        return total;
    }

    public double totalSalesLines() {
        return this.salesRepository.getSalesArrayList().size();
    }

    public double averageSales() {
        return this.totalSalesValue() / this.salesRepository.getSalesArrayList().size();
    }
}
