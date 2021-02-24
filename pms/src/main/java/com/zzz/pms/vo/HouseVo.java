package com.zzz.pms.vo;

import com.zzz.pms.entity.Complaint;
import com.zzz.pms.entity.House;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * <p>
 *
 * @Author: Zzz
 * @Date: 2021/2/18 18:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseVo extends House {
    private Integer page;
    private Integer limit;
}
