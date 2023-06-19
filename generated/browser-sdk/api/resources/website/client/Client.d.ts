/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as core from "../../../../core";
import { V1 } from "../resources/v1/client/Client";
export declare namespace Website {
    interface Options {
        environment: core.Supplier<string>;
        username?: core.Supplier<string | undefined>;
        password?: core.Supplier<string | undefined>;
    }
}
export declare class Website {
    protected readonly options: Website.Options;
    constructor(options: Website.Options);
    protected _v1: V1 | undefined;
    get v1(): V1;
}