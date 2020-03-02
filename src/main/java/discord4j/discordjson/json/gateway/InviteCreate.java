package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableInviteCreate.class)
public interface InviteCreate extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();

    @JsonProperty("channel_id")
    String channelId();

    String code();

    @JsonProperty("created_at")
    String createdAt();

    int uses();

    @JsonProperty("max_uses")
    int maxUses();

    @JsonProperty("max_age")
    int maxAge();

    boolean temporary();

    default Possible<UserData> inviter() { return Possible.absent(); }
}
