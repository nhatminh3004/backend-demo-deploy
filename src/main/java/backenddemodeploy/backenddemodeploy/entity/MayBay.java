package backenddemodeploy.backenddemodeploy.entity;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "mamb")
    private int mamb;
    @Column(name = "loai")
    private String loai;
    @Column(name = "tambay")
    private int tamBay;
    //thêm mối quan hệ nhiều nhiều với nhân viên
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "chungnhan", joinColumns = {@JoinColumn(name = "mamb",referencedColumnName ="mamb" )}, inverseJoinColumns = {@JoinColumn(name = "manv",referencedColumnName = "manv")})
    private Set<NhanVien> nhanViens;
}
