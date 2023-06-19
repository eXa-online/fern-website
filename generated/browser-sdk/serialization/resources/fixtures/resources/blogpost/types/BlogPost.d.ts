/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "../../../../..";
import * as EXaOnlineGmbHFernWebsite from "../../../../../../api";
import * as core from "../../../../../../core";
export declare const BlogPost: core.serialization.ObjectSchema<serializers.fixtures.BlogPost.Raw, EXaOnlineGmbHFernWebsite.fixtures.BlogPost>;
export declare namespace BlogPost {
    interface Raw {
        slug: serializers.fixtures.BlogPostSlug.Raw;
        author: string;
        title: string;
        image?: string | null;
        "publicatione-date": string;
        richtext?: string | null;
    }
}
