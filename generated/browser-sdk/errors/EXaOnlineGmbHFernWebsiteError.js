"use strict";
/**
 * This file was auto-generated by Fern from our API Definition.
 */
Object.defineProperty(exports, "__esModule", { value: true });
exports.EXaOnlineGmbHFernWebsiteError = void 0;
class EXaOnlineGmbHFernWebsiteError extends Error {
    constructor({ message, statusCode, body }) {
        super(message);
        Object.setPrototypeOf(this, EXaOnlineGmbHFernWebsiteError.prototype);
        if (statusCode != null) {
            this.statusCode = statusCode;
        }
        if (body !== undefined) {
            this.body = body;
        }
    }
}
exports.EXaOnlineGmbHFernWebsiteError = EXaOnlineGmbHFernWebsiteError;