package com.zzz.pms.vo;

import com.zzz.pms.entity.Complaint;
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
public class ComplaintVo extends Complaint {
    private Integer page;
    private Integer limit;
}
