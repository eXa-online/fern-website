/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as errors from "../../../../errors";
import express from "express";
export declare class NotFoundError extends errors.EXaOnlineGmbHFernWebsiteError {
    constructor();
    send(res: express.Response): void;
}
