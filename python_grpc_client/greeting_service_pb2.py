# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: greeting_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16greeting_service.proto\x12\x10\x63om.example.grpc\"-\n\x0cHelloRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0f\n\x07hobbies\x18\x02 \x03(\t\"!\n\rHelloResponse\x12\x10\n\x08greeting\x18\x01 \x01(\t\"P\n\x0b\x45normousDTO\x12\x0f\n\x07strings\x18\x01 \x03(\t\x12\r\n\x05longs\x18\x02 \x03(\x03\x12\x0f\n\x07\x64oubles\x18\x03 \x03(\x01\x12\x10\n\x08\x62ooleans\x18\x04 \x03(\x08\x32\xd4\x02\n\x0fGreetingService\x12K\n\x08greeting\x12\x1e.com.example.grpc.HelloRequest\x1a\x1f.com.example.grpc.HelloResponse\x12R\n\x0flongComputation\x12\x1e.com.example.grpc.HelloRequest\x1a\x1f.com.example.grpc.HelloResponse\x12L\n\x0cheavyPayload\x12\x1d.com.example.grpc.EnormousDTO\x1a\x1d.com.example.grpc.EnormousDTO\x12R\n\x10heavyPayloadList\x12\x1d.com.example.grpc.EnormousDTO\x1a\x1d.com.example.grpc.EnormousDTO0\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'greeting_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _HELLOREQUEST._serialized_start=44
  _HELLOREQUEST._serialized_end=89
  _HELLORESPONSE._serialized_start=91
  _HELLORESPONSE._serialized_end=124
  _ENORMOUSDTO._serialized_start=126
  _ENORMOUSDTO._serialized_end=206
  _GREETINGSERVICE._serialized_start=209
  _GREETINGSERVICE._serialized_end=549
# @@protoc_insertion_point(module_scope)