package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.TopicPartitionInfo
import io.vertx.kafka.client.common.Node

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.TopicPartitionInfo] objects.
 *
 * A class containing leadership, replicas and ISR information for a topic partition.
 *
 * @param isr  Set the subset of the replicas that are in sync
 * @param leader  Set the node id of the node currently acting as a leader
 * @param partition  Set the partition id
 * @param replicas  Set the complete set of replicas for this partition
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.TopicPartitionInfo original] using Vert.x codegen.
 */
fun topicPartitionInfoOf(
  isr: Iterable<io.vertx.kafka.client.common.Node>? = null,
  leader: io.vertx.kafka.client.common.Node? = null,
  partition: Int? = null,
  replicas: Iterable<io.vertx.kafka.client.common.Node>? = null): TopicPartitionInfo = io.vertx.kafka.client.common.TopicPartitionInfo().apply {

  if (isr != null) {
    this.setIsr(isr.toList())
  }
  if (leader != null) {
    this.setLeader(leader)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (replicas != null) {
    this.setReplicas(replicas.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.TopicPartitionInfo] objects.
 *
 * A class containing leadership, replicas and ISR information for a topic partition.
 *
 * @param isr  Set the subset of the replicas that are in sync
 * @param leader  Set the node id of the node currently acting as a leader
 * @param partition  Set the partition id
 * @param replicas  Set the complete set of replicas for this partition
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.TopicPartitionInfo original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("topicPartitionInfoOf(isr, leader, partition, replicas)")
)
fun TopicPartitionInfo(
  isr: Iterable<io.vertx.kafka.client.common.Node>? = null,
  leader: io.vertx.kafka.client.common.Node? = null,
  partition: Int? = null,
  replicas: Iterable<io.vertx.kafka.client.common.Node>? = null): TopicPartitionInfo = io.vertx.kafka.client.common.TopicPartitionInfo().apply {

  if (isr != null) {
    this.setIsr(isr.toList())
  }
  if (leader != null) {
    this.setLeader(leader)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (replicas != null) {
    this.setReplicas(replicas.toList())
  }
}

