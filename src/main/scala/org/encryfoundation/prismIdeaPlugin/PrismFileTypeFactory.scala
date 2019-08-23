package org.encryfoundation.prismIdeaPlugin

import com.intellij.openapi.fileTypes.{FileTypeConsumer, FileTypeFactory}

case class PrismFileTypeFactory() extends FileTypeFactory {

  override def createFileTypes(fileTypeConsumer: FileTypeConsumer): Unit =
    fileTypeConsumer.consume(PrismFileType.INSTANCE, "pr")
}
