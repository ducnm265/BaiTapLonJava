public class Desktop extends MayTinh {
    private String loaiCase;
    private boolean coManHinhKem;

    public Desktop(String maMay, String hangSX, double giaGoc, int namSX,
                   String loaiCase, boolean coManHinhKem) {
        super(maMay, hangSX, giaGoc, namSX);
        this.loaiCase = loaiCase;
        this.coManHinhKem = coManHinhKem;
    }

    public String getLoaiCase() {
        return loaiCase;
    }

    public void setLoaiCase(String loaiCase) {
        this.loaiCase = loaiCase;
    }

    public boolean isCoManHinhKem() {
        return coManHinhKem;
    }

    public void setCoManHinhKem(boolean coManHinhKem) {
        this.coManHinhKem = coManHinhKem;
    }

    // Giá bán = Giá gốc * 1.1 + 3.000.000 nếu có màn hình kèm theo
    @Override
    public double tinhGiaBan() {
        double tienManHinh = coManHinhKem ? 3_000_000 : 0;
        return getGiaGoc() * 1.1 + tienManHinh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("[Desktop] ");
        super.hienThiThongTin();
        System.out.printf(" | Case: %s | Kèm màn hình: %s | Giá bán: %,.0f VNĐ%n",
                loaiCase, (coManHinhKem ? "Có" : "Không"), tinhGiaBan());
    }
}