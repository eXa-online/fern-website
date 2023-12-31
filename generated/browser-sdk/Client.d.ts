/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as core from "./core";
import { Website } from "./api/resources/website/client/Client";
export declare namespace ExaOnlineDeFernWebsiteClient {
    interface Options {
        environment: core.Supplier<string>;
        username?: core.Supplier<string | undefined>;
        password?: core.Supplier<string | undefined>;
    }
}
export declare class ExaOnlineDeFernWebsiteClient {
    protected readonly options: ExaOnlineDeFernWebsiteClient.Options;
    constructor(options: ExaOnlineDeFernWebsiteClient.Options);
    protected _website: Website | undefined;
    get website(): Website;
}
