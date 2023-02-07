package backenddemodeploy.backenddemodeploy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.sql.Time;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(name = "macb")
    private String maChuyenBay;
    @Column(name = "gadi")
    private String gaDi;
    @Column(name = "gaden")
    private String gaDen;
    @Column(name = "dodai")
    private String doDai;
    @Column(name = "giodi")
    private Time gioDi;
    @Column(name = "gioden")
    private Time gioDen;
    @Column(name = "chiphi")
    private int chiPhi;
}
