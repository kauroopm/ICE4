
public final class CEO extends Manager {

    private double _stockPrice;
    private int _numberShareSold;

    public CEO(String R, double K, double N, double bonus, double stockPrice, int shareholder) {
        super(R, K, N, bonus);
        _stockPrice = stockPrice;
        _numberShareSold = shareholder;
    }

    public void setStockPrice(double _stockPrice) {
        this._stockPrice = _stockPrice;
    }

    public void setNumberShareSold(int _numberShareSold) {
        this._numberShareSold = _numberShareSold;
    }

    @Override
    public final double calculatePay() {
        return (super.calculatePay() + _stockPrice * _numberShareSold);
    }

    @Override
    public String toString() {
        String str = super.toString() + ", StockPrice: " + _stockPrice + ", NumberShareSold: " + _numberShareSold;
        return str;
    }
}
