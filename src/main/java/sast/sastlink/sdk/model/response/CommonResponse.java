package sast.sastlink.sdk.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @projectName: sast-link-SDK
 * @author: feelMoose
 * @date: 2023/8/19 21:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {
    @JsonAlias("Data")
    private Map<String, Object> data;
    @JsonAlias("ErrCode")
    private Integer errCode;
    @JsonAlias("ErrMsg")
    private String errMsg;
    @JsonAlias("Success")
    private boolean success;
}




