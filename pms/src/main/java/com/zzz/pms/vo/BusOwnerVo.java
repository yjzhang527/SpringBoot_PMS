package com.zzz.pms.vo;

import com.zzz.pms.entity.Busowner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * <p>
 *
 * @Author: Zzz
 * @Date: 2021/2/13 18:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusOwnerVo extends Busowner {
    private Integer page;
    private Integer limit;
}
