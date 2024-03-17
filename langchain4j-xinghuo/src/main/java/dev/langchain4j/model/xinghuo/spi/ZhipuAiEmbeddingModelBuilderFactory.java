package dev.langchain4j.model.xinghuo.spi;

import dev.langchain4j.model.xinghuo.ZhipuAiEmbeddingModel;

import java.util.function.Supplier;

/**
 * A factory for building {@link ZhipuAiEmbeddingModel.ZhipuAiEmbeddingModelBuilder} instances.
 */
public interface ZhipuAiEmbeddingModelBuilderFactory extends Supplier<ZhipuAiEmbeddingModel.ZhipuAiEmbeddingModelBuilder> {
}
