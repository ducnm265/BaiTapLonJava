public abstract class MayTinh {
    private String maMay;
    private String hangSX;
    private double giaGoc;
    private int namSX;

    public MayTinh() {
    }

    public MayTinh(String maMay, String hangSX, double giaGoc, int namSX) {
        this.maMay = maMay;
        this.hangSX = hangSX;
        setGiaGoc(giaGoc);
        this.namSX = namSX;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        if (giaGoc < 0) {
            throw new IllegalArgumentException("Giá gốc không được âm!");
        }
        this.giaGoc = giaGoc;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    // Phương thức trừu tượng: mỗi loại máy có cách tính giá bán khác nhau
    public abstract double tinhGiaBan();

    public void hienThiThongTin() {
        System.out.printf("Mã: %s | Hãng: %s | Năm SX: %d | Giá gốc: %,.0f VNĐ",
                maMay, hangSX, namSX, giaGoc);
    }
}