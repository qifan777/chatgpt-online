package io.qifan.chatgpt.assistant.gpt.dto.response;

import io.qifan.chatgpt.assistant.gpt.ChatConfig.GPTModel;
import io.qifan.chatgpt.assistant.user.dto.response.UserCommonResponse;
import io.qifan.infrastructure.common.model.BaseResponse;
import io.qifan.infrastructure.common.mongo.ValidStatus;
import lombok.Data;


@Data
public class ChatConfigCommonResponse extends BaseResponse {
    private GPTModel model;
    private Double temperature;
    private Integer maxTokens;
    private Double presencePenalty;
    private String apiKey;
    private UserCommonResponse createdBy;
    private ValidStatus validStatus;
}