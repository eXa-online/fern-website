/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "../../../../..";
import { EXaOnlineGmbHFernWebsite } from "../../../../../..";
import * as core from "../../../../../../core";
export declare const CreateBlogPostRequest: core.serialization.ObjectSchema<serializers.fixtures.CreateBlogPostRequest.Raw, EXaOnlineGmbHFernWebsite.fixtures.CreateBlogPostRequest>;
export declare namespace CreateBlogPostRequest {
    interface Raw {
        slug: serializers.fixtures.BlogPostSlug.Raw;
        title: string;
        author: string;
        image?: string | null;
        "publicatione-date"?: string | null;
        richtext?: string | null;
    }
}
