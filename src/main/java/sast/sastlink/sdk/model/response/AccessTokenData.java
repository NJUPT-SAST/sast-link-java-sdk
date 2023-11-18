package sast.sastlink.sdk.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: sast-link-SDK
 * @author: feelMoose
 * @date: 2023/8/19 21:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccessTokenData {
    private String access_token;
    private Integer expires_in;
    private String refresh_token;
    private String scope;
    private String token_type;
}
