//package com.admin.dto;
//
//import org.springframework.http.HttpStatus;
//
//import java.util.HashMap;
//
//public class Response extends HashMap<String, Object> {
//
//        private static final long serialVersionUID = -8713837118340960775L;
//
//        public Response success() {
//            this.code(HttpStatus.OK);
//            this.message("success");
//            this.data(null);
//            return this;
//        }
//
//        public Response success(Object data) {
//            this.code(HttpStatus.OK);
//            this.message("success");
//            this.data(data);
//            return this;
//        }
//
//        public Response success(Object data, String message) {
//            this.code(HttpStatus.OK);
//            this.message(message);
//            this.data(data);
//            return this;
//        }
//
//        public Response fail() {
//            this.code(HttpStatus.INTERNAL_SERVER_ERROR);
//            this.data(null);
//            this.message("error");
//            return this;
//        }
//
//        public Response fail(String message) {
//            this.code(HttpStatus.INTERNAL_SERVER_ERROR);
//            this.data(null);
//            this.message(message);
//            return this;
//        }
//
//        public Response fail(HttpStatus status, Object data, String message) {
//            this.code(status);
//            this.data(data);
//            this.message(message);
//            return this;
//        }
//
//        public Response fail(Object data, String message) {
//            this.code(HttpStatus.INTERNAL_SERVER_ERROR);
//            this.data(data);
//            this.message(message);
//            return this;
//        }
//
//        public Response code(HttpStatus status) {
//            this.put("code", status.value());
//            return this;
//        }
//
//        public Response message(String message) {
//            this.put("message", message);
//            return this;
//        }
//
//        public Response data(Object data) {
//            this.put("data", data);
//            return this;
//        }
//
//        @Override
//        public Response put(String key, Object value) {
//            super.put(key, value);
//            return this;
//        }
//
//    }
//
//
