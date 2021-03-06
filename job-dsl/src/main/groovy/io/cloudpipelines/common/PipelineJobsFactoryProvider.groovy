package io.cloudpipelines.common

import javaposse.jobdsl.dsl.DslFactory

import io.cloudpipelines.projectcrawler.Repository

interface PipelineJobsFactoryProvider {
	/**
	 * Gets the concrete jobs factory
	 */
	PipelineJobsFactory get(PipelineDefaults pipelineDefaults,
							DslFactory dsl,
							PipelineDescriptor descriptor,
							Repository repository)

	/**
	 * List of additional files that should be parsed
	 */
	List<String> additionalFiles()
}
