package com.orange.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "xp_moped")
public class XpMoped {
    @Id
    private Long id;

    private String mopedModel;

    private String mopedNo;

    private String electronicTagNo;

    private Long operatorId;

    private String docksiteId;

    private String docksiteNo;

    private String docksiteName;

    private String batteryId;

    private String batteryNo;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Byte status;

    private Date useTime;

    private Date createdAt;

    private Date updatedAt;

    private Long creatorId;

    private Long updatorId;

    private String remark;

    private BigDecimal surplusElectric;

    private BigDecimal totalElectric;

    private BigDecimal voltage;

    private String terminalNo;
}