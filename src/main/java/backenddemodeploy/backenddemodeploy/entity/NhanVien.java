package backenddemodeploy.backenddemodeploy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "manv")
    private String manv;
    @Column(name = "ten")
    private String ten;
    @Column(name = "luong")
    private int luong;
    //thêm mối quan hệ nhiều nhiều với máy bay phát sinh ra bảng mới , thuộc tính joinColums đại diện cho khoá chính và khoá ngoại hiện đứng ở entity nào thì để khoá chính entity đó vào, thuộc tính invertJoincolums đại diện cho entity hiện không đứng
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "chungnhan", joinColumns = {@JoinColumn(name = "manv",referencedColumnName ="manv" )}, inverseJoinColumns = {@JoinColumn(name = "mamb",referencedColumnName = "mamb")})
    private Set<MayBay> mayBays;
}
