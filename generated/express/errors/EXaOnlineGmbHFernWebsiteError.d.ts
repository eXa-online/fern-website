/**
 * This file was auto-generated by Fern from our API Definition.
 */
import express from "express";
export declare abstract class EXaOnlineGmbHFernWebsiteError extends Error {
    constructor();
    abstract send(res: express.Response): void;
}
