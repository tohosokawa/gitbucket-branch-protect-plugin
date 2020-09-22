import com.github.tohosokawa.ProtectedBranchService.ProtectedBranchReceiveHook
import io.github.gitbucket.solidbase.model.Version

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "branch-protect"
  override val pluginName: String = "Branch Protect Plugin"
  override val description: String = "Disables force and non force-pushes to this branch and prevents it from being deleted."
  override val versions: List[Version] = List(
    // 4.15.0 - 4.31.2
    new Version("1.0.0"),new Version("1.0.1"),
    // 4.32.0 -
    new Version("1.1.0")
  )

  override val receiveHooks = Seq(
    new ProtectedBranchReceiveHook()
  )
}
