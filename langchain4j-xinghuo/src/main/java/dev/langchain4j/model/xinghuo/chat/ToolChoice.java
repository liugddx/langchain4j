package dev.langchain4j.model.xinghuo.chat;

import static dev.langchain4j.model.xinghuo.chat.ToolType.FUNCTION;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class ToolChoice {

    private final ToolType type = FUNCTION;
    private final Function function;

    public ToolChoice(String functionName) {
        this.function = Function.builder().name(functionName).build();
    }

    public static ToolChoice from(String functionName) {
        return new ToolChoice(functionName);
    }
}