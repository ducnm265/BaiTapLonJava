public class Laptop extends MayTinh {
    private double trongLuong; // kg
    private int dungLuongPin;  // Wh

    public Laptop(String maMay, String hangSX, double giaGoc, int namSX,
                  double trongLuong, int dungLuongPin) {
        super(maMay, hangSX, giaGoc, namSX);
        this.trongLuong = trongLuong;
        this.dungLuongPin = dungLuongPin;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    public int getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(int dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    // Giá bán = Giá gốc * 1.1 (thuế VAT 10%), cộng thêm 500.000 nếu siêu nhẹ (< 1.5kg)
    @Override
    public double tinhGiaBan() {
        double phuPhiSieuNhe = (trongLuong < 1.5) ? 500_000 : 0;
        return getGiaGoc() * 1.1 + phuPhiSieuNhe;
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("[Laptop] ");
        super.hienThiThongTin();
        System.out.printf(" | Trọng lượng: %.2f kg | Pin: %d Wh | Giá bán: %,.0f VNĐ%n",
                trongLuong, dungLuongPin, tinhGiaBan());
    }
}